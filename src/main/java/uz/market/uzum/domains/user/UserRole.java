package uz.market.uzum.domains.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String code;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            uniqueConstraints = @UniqueConstraint(columnNames = {"user_role_id", "user_permission_id"}),
            name = "role_permissions",
            joinColumns = @JoinColumn(name = "user_role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_permission_id", referencedColumnName = "id")
    )
    private Collection<UserPermission> authPermissions;


    public UserRole(String code) {
        this.code = code;
    }

    public UserRole(Integer id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
