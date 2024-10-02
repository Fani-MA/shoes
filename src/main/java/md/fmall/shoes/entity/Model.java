package md.fmall.shoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    String name;

    @ManyToOne
    Type type;

    @ManyToMany
    @JoinTable(name = "top_materials",
            joinColumns = @JoinColumn(name = "model_id"),
            inverseJoinColumns = @JoinColumn(name = "material_id"))
    List<Material> topMaterials = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "bottom_materials",
            joinColumns = @JoinColumn(name = "model_id"),
            inverseJoinColumns = @JoinColumn(name = "material_id"))
    List<Material> bottomMaterials = new ArrayList<>();

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL)
    List<Shoes> choes = new ArrayList<>();
}
