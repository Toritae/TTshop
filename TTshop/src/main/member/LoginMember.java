import javax.persistence.GeneratedValue;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Lombok
@NoArgsConstructor //Lombok
@Entity //JPA가 관리하는 클래스
public class Member {
    
    @Id @GeneratedValue
    private long seq;

    @NotEmpty
    private String email;
    @NotEmpty
    private String password;

    private String name;

    @Column(name = "RegDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public Member(@NotEmpty String email, @NotEmpty Srting password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
        this.data = LocalDate.now();
    }
}
