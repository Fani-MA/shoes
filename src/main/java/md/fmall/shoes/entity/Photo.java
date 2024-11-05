package md.fmall.shoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "photos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Photo {
    @Id
    Long id;

    String path;

    @ManyToOne
    @JoinColumn(name = "model_id")
    Model model;
}
