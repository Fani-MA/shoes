package md.fmall.shoes.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "gender_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GenderType {
    @Id
    Long id;

    String name;

    @OneToMany(mappedBy = "genderType")
    Set<Model> models = new HashSet<>();
}
