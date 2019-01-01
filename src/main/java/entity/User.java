package entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User implements Serializable{
private Integer id;
private String name;
private String password;
private Integer departId;
private Integer age;
private int sex;

private Depart  depart;
}