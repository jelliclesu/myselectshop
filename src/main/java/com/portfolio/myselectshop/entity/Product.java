package com.portfolio.myselectshop.entity;

import com.portfolio.myselectshop.dto.ProductRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // JPA 가 관리할 수 있는 Entity 클래스 지정
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String link;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private int lprice;

    @Column(nullable = false)
    private String myprice;

}
