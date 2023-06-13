package idusw.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // 엔티티 클래스임으로 나타내는 애노테이션
@Table(name = "b201612038_member")

@ToString   // lombok 라이브러리 사용
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MemberEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "b201612038_member_seq_gen")
    @SequenceGenerator(sequenceName = "b201612038_member_seq", name = "b201612038_member_gen",
            initialValue = 1, allocationSize = 1)
    // Oracle : GenerationType.SEQUENCE, Mysql : GenerationType.IDENTITY, auto_increment
    private Long seq;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String pw;
}

