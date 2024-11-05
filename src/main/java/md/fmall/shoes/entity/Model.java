package md.fmall.shoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "model")
    Set<Photo> photos;

    @ManyToOne
    @JoinColumn(name = "type_id")
    Type type;

    @ManyToOne
    @JoinColumn(name = "gender_type_id")
    GenderType genderType;

    @ManyToMany
    @JoinTable(name = "top_materials",
            joinColumns = @JoinColumn(name = "model_id"),
            inverseJoinColumns = @JoinColumn(name = "material_id"))
    Set<Material> topMaterials = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "bottom_materials",
            joinColumns = @JoinColumn(name = "model_id"),
            inverseJoinColumns = @JoinColumn(name = "material_id"))
    Set<Material> bottomMaterials = new HashSet<>();

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL)
    List<Shoes> choes = new ArrayList<>();
}
