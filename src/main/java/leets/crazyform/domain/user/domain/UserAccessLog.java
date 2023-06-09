package leets.crazyform.domain.user.domain;

import jakarta.persistence.*;
import leets.crazyform.domain.shared.entity.BaseCreateTimeEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity(name = "user_access_logs")
public class UserAccessLog extends BaseCreateTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "CHAR(25)")
    private String ip;

    @Column
    private String userAgent;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
