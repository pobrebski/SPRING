package pl.com.mnemonic.entity;
// Generated 2016-11-22 19:13:13 by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SystemRole generated by hbm2java
 */
@Entity
@Table(name = "system_roles", catalog = "spring_role_manager")
public class SystemRole implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idSystemRoles;
	private String name;
	private String description;
	private Set<SystemUserRole> systemUserRoleses = new HashSet<SystemUserRole>(0);

	public SystemRole() {
	}

	public SystemRole(String name) {
		this.name = name;
	}

	public SystemRole(String name, String description, Set<SystemUserRole> systemUserRoleses) {
		this.name = name;
		this.description = description;
		this.systemUserRoleses = systemUserRoleses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_system_roles", unique = true, nullable = false)
	public Integer getIdSystemRoles() {
		return this.idSystemRoles;
	}

	public void setIdSystemRoles(Integer idSystemRoles) {
		this.idSystemRoles = idSystemRoles;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 300)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "systemRoles")
	public Set<SystemUserRole> getSystemUserRoleses() {
		return this.systemUserRoleses;
	}

	public void setSystemUserRoleses(Set<SystemUserRole> systemUserRoleses) {
		this.systemUserRoleses = systemUserRoleses;
	}

}
