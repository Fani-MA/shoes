package md.fmall.choes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DialectOverride;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "choes")
public class Choes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String url;

    Long article;

    @ManyToMany
    @JoinTable(name = "chose_model",
            joinColumns = @JoinColumn(name = "choes_id"),
            inverseJoinColumns = @JoinColumn(name = "size_id"))
    List<Size> sizes;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    Model model;

    @ManyToOne
    @JoinColumn(name = "color_id", nullable = false)
    Color color;

}
