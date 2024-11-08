package md.fmall.shoes.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "materials")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(nullable = false)
    String name;

    @ManyToMany(mappedBy = "topMaterials")
    Set<Model> topMaterialModels;

    @ManyToMany(mappedBy = "bottomMaterials")
    Set<Model> bottomMaterialModels;
}
