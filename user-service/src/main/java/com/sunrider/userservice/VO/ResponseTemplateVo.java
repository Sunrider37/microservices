package com.sunrider.userservice.VO;

import com.sunrider.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {

    private User user;
    private Department department;

}
