# My Select Shop

## 프로젝트 소개

- 키워드로 상품을 검색하여 관심 상품을 조회, 등록할 수 있으며, 관심 상품에 원하는 가격을 등록하면 최저가가일 때 표시해주는 웹 사이트

---

## 프로젝트 목표

- NAVER API 이용하여 쉬운 상품 검색 및 조회
- 회원 별 관심 상품 등록 및 조회
- 회원 별 관심 상품 폴더 설정

---

## 주요 기능

### 상품 검색 및 조회

- 키워드로 상품 정보 검색 후 조회

### 관심 상품 등록 및 조회

- 관심 상품 등록
    - 최저가 설정
        - 최소 100원 이상 입력
- 관심 상품 조회
    - 최저가 표시
        - 희망하는 최저가보다 실제 최저가가 낮은 경우 표시
        - 매일 새벽 1시에 관심 상품 목록 제목으로 검색해서, 최저가 정보 업데이트
    - 페이징 및 정렬

### 관심 상품 폴더

- 회원 별 폴더 생성 - 1 ~ N 개 한번에 추가 가능
- 관심 상품에 폴더 설정
- 폴더 별 관심 상품 조회

---

## 적용 기술

### 언어 / 프레임워크

- JAVA 17
- Spring Boot 3.3.4
- Spring Security
- Spring Web
- Spring Data JPA
- Validation
- Lombok
- Thymeleaf
- MySQL Driver

### DB

- MySQL
- AWS RDS

### 배포

- AWS EC2

### OPEN API

- 네이버 쇼핑 API

---

## API

| 기능 | Method | API |
| --- | --- | --- |
| 키워드로 상품 검색 | GET | /api/search |
| 관심 상품 등록 | POST | /api/products |
| 관심 상품 희망 최저가 업데이트 | PUT | /api/products/{id} |
| 관심 상품 조회 | GET | /api/products |
| 로그인 페이지 | GET | /api/user/login-page |
| 회원가입 페이지 | GET | /api/user/signup |
| 회원가입 | POST | /api/user/signup |
| 회원 정보 요청 | GET | /api/user-info |
| 로그인 | JWT | /api/user/login |
| 회원의 폴더 생성 | POST | /api/folders |
| 회원의 폴더 조회 | GET | /api/user-folder |
| 폴더 전체 조회 | GET | /api/folders |
| 폴더 추가 | POST | /api/products/{productId}/folder |
| 폴더 별 상품 조회 | GET | /api/folders/{folderId}/products |
