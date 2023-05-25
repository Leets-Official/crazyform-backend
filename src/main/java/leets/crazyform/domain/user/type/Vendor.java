package leets.crazyform.domain.user.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Vendor {
    KAKAO("KAKAO"),
    GOOGLE("GOOGLE"),
    NAVER("NAVER"),
    FACEBOOK("FACEBOOK"),
    TWITTER("TWITTER");

    private final String vendor;
}
