package com.portfolio.myselectshop.service;

import com.portfolio.myselectshop.dto.FolderResponseDto;
import com.portfolio.myselectshop.entity.Folder;
import com.portfolio.myselectshop.entity.User;
import com.portfolio.myselectshop.repository.FolderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FolderService {

    private final FolderRepository folderRepository;

    // 로그인한 회원에 폴더들 등록
    public void addFolders(List<String> folderNames, User user) {
        // 입력으로 들어온 폴더 이름을 기준으로, 회원이 이미 생성한 폴더들 조회
        List<Folder> existFolderList = folderRepository.findAllByUserAndNameIn(user, folderNames);

        List<Folder> folderList = new ArrayList<>();

        for (String folderName : folderNames) {
            // 이미 생성한 폴더가 아닌 경우만 폴더 생성
            if (!isExistFolderName(folderName, existFolderList)) {
                Folder folder = new Folder();
                folderList.add(folder);
            } else {
                throw new IllegalArgumentException("폴더명이 중복되었습니다.");
            }
        }

        folderRepository.saveAll(folderList);
    }

    private boolean isExistFolderName(String folderName, List<Folder> existFolderList) {
        // 기존 폴더 리스트에 folder name 이 있는지 확인
        for (Folder exitstFolder : existFolderList) {
            if (folderName.equals(exitstFolder.getName())) {
                return true;
            }
        }
        return false;

    }

    // 로그인한 회원이 등록된 모든 폴더 조회
    public List<FolderResponseDto> getFolders(User user) {
        List<Folder> folderList = folderRepository.findAllByUser(user);
        List<FolderResponseDto> responseDtoList = new ArrayList<>();

        for (Folder folder : folderList) {
            responseDtoList.add(new FolderResponseDto(folder));
        }

        return responseDtoList;
    }
}
