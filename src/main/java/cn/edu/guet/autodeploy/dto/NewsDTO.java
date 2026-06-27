package cn.edu.guet.autodeploy.dto;

import lombok.Data;

import java.util.List;

@Data
public class NewsDTO {
    Integer roleId;
    List<Integer> permissionIds;
}
