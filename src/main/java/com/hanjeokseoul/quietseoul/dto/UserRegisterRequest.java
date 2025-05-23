package com.hanjeokseoul.quietseoul.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterRequest {

    @NotBlank(message = "아이디는 필수입니다.")
    private String username;

    @NotBlank(message = "비밀번호는 필수입니다.")
    @Pattern(
            regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,20}$",
            message = "비밀번호는 8~20자, 숫자+영문+특수문자를 포함해야 합니다."
    )
    private String password;

    @NotBlank(message = "이름은 필수입니다.")
    private String name;

    @NotBlank(message = "전화번호는 필수입니다.")
    @Pattern(
            regexp = "^\\d{3}-\\d{4}-\\d{4}$",
            message = "010-xxxx-xxxx 형식이어야 합니다"
    )
    private String phone;

    @NotBlank(message = "생년월일은 필수입니다.")
    @Pattern(
            regexp = "^\\d{4}-\\d{2}-\\d{2}$",
            message = "생년월일은 yyyy-MM-dd 형식이어야 합니다."
    )
    private String birthdate;


    @NotBlank(message = "성별은 필수입니다.")
    @Pattern(
            regexp = "^(M|F)$",
            message = "성별은 'M' 또는 'F'로 입력해주세요."
    )
    private String gender;

    // private String role; // 관리자 계정은 수동 생성 / 기본 유저는 프론트에서 role 없이 요청
}
