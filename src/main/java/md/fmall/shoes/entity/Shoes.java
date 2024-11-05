package md.fmall.shoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shoes")
public class Shoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String url;

    Long article;

    @ManyToMany
    @JoinTable(name = "shose_model",
            joinColumns = @JoinColumn(name = "shoes_id"),
            inverseJoinColumns = @JoinColumn(name = "size_id"))
    List<Size> sizes;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    Model model;

    @ManyToOne
    @JoinColumn(name = "color_id", nullable = false)
    Color color;
}
