package entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Depart implements Serializable{
private Integer id;
private String name;
private Integer parent;
}