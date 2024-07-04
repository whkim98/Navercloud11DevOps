package mycar.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;

@Entity
@Table(name = "mycar_comment")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MyCarCommentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    @ManyToOne
    @JoinColumn(name="num")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private MycarDto mycar;

    @Column(length = 200)
    private String comment;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    @Column(updatable = false)
    private Timestamp writeday;
}
