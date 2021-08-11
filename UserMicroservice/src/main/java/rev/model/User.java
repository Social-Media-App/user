package rev.model;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

=======
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
>>>>>>> 15e7e91b11090bfb4d046836710a3f3bdabc1e95
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Users")
public class User implements UserDetails {

	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="username", nullable = false, unique = true)
	private String username;
	
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="profile_picture", nullable = false)
	@ColumnDefault(value="'Default.png'")
	private String profilePicture;
	
	@Column(name="background_picture", nullable = false)
	@ColumnDefault(value="'DefaultBackground.png'")
	private String backgroundPicture;
	
	@Column(name="email", nullable = false, unique = true)
	private String email;
<<<<<<< HEAD

	//private Set<GrantedAuthority> authorities;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
=======
	
	@OneToMany(mappedBy = "initUser", fetch = FetchType.LAZY)
	private Set<SeeFirst> seeFirst = new HashSet<>();


	
//	@JoinTable(name="see_first",
//			joinColumns={@JoinColumn(name="see_id")},
//			inverseJoinColumns={@JoinColumn(name="seen_id")})
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private Set<User> seeFirst = new HashSet<User>();
//	
//	
//	@JsonProperty(access = Access.WRITE_ONLY)
//	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "seeFirst", cascade = CascadeType.ALL)
//	private Set<User> beingSeen = new HashSet<User>();
	
	

	public User(String username, String firstName, String lastName, String password, String email) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}
	public User(int userId, String username, String firstName, String middleName, String lastName, String password,
			String profilePicture, String backgroundPicture, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.password = password;
		this.profilePicture = profilePicture;
		this.backgroundPicture = backgroundPicture;
		this.email = email;
	}

	public User(int userId) {
		super();
		this.userId = userId;
	}	
//	public User(String username2, String password2, Object object) {
//
//	}
	
>>>>>>> 15e7e91b11090bfb4d046836710a3f3bdabc1e95
}

