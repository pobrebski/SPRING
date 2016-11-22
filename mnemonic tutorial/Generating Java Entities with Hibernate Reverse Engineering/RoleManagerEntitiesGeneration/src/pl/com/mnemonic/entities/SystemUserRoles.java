package pl.com.mnemonic.entities;
// Generated 2016-11-22 19:13:13 by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SystemUserRoles generated by hbm2java
 */
@Entity
@Table(name = "system_user_roles", catalog = "spring_role_manager")
public class SystemUserRoles implements java.io.Serializable {

	private Integer idSystemUserRoles;
	private SystemRoles systemRoles;
	private SystemUsers systemUsers;

	public SystemUserRoles() {
	}

	public SystemUserRoles(SystemRoles systemRoles, SystemUsers systemUsers) {
		this.systemRoles = systemRoles;
		this.systemUsers = systemUsers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_system_user_roles", unique = true, nullable = false)
	public Integer getIdSystemUserRoles() {
		return this.idSystemUserRoles;
	}

	public void setIdSystemUserRoles(Integer idSystemUserRoles) {
		this.idSystemUserRoles = idSystemUserRoles;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "system_roles_id_system_roles", nullable = false)
	public SystemRoles getSystemRoles() {
		return this.systemRoles;
	}

	public void setSystemRoles(SystemRoles systemRoles) {
		this.systemRoles = systemRoles;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "system_users_id_system_user", nullable = false)
	public SystemUsers getSystemUsers() {
		return this.systemUsers;
	}

	public void setSystemUsers(SystemUsers systemUsers) {
		this.systemUsers = systemUsers;
	}

}
