package pl.com.mnemonic.ems.entity;
// Generated 2015-12-28 19:39:42 by Hibernate Tools 4.0.0.Final

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;


/**
 * MediaCounter generated by hbm2java
 */
@Entity
@Table(name = "media_counter", catalog = "estates")
public class MediaCounter implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1600474413434600131L;
	private Integer idmediaCounter;
	private Media media;
	private Place place;
	private String mediaType;
	private String counterType;
	private String registryNumber;
	private Date dateRegistered;
	private Date dateUpdated;
	private Double totalAmount;
	private Set<Report> reports = new HashSet<Report>(0);
	private Set<Expense> expenses = new HashSet<Expense>(0);

	public MediaCounter() {
	}

	public MediaCounter(Media media, String mediaType) {
		this.media = media;
		this.mediaType = mediaType;
	}

	public MediaCounter(Media media, String mediaType, String counterType, String registryNumber, Date dateRegistered,
			Date dateUpdated, Double totalAmount, Set<Report> reports) {
		this.media = media;
		this.mediaType = mediaType;
		this.counterType = counterType;
		this.registryNumber = registryNumber;
		this.dateRegistered = dateRegistered;
		this.dateUpdated = dateUpdated;
		this.totalAmount = totalAmount;
		this.reports = reports;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idmedia_counter", unique = true, nullable = false)
	public Integer getIdmediaCounter() {
		return this.idmediaCounter;
	}

	public void setIdmediaCounter(Integer idmediaCounter) {
		this.idmediaCounter = idmediaCounter;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "media_idmedia", nullable = false)
	public Media getMedia() {
		return this.media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	@Column(name = "mediaType", nullable = false, length = 100)
	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	@Column(name = "counterType", length = 100)
	public String getCounterType() {
		return this.counterType;
	}

	public void setCounterType(String counterType) {
		this.counterType = counterType;
	}

	@Column(name = "registryNumber", length = 100)
	public String getRegistryNumber() {
		return this.registryNumber;
	}

	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateRegistered", length = 19)
	public Date getDateRegistered() {
		return this.dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateUpdated", length = 19)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@Column(name = "totalAmount", precision = 22, scale = 0)
	public Double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mediaCounter", orphanRemoval = true)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	public Set<Report> getReports() {
		return this.reports;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "place_idplace", nullable = false)
	public Place getPlace() {
		return this.place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mediaCounter", orphanRemoval = true)
	public Set<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(Set<Expense> expenses) {
		this.expenses = expenses;
	}

}
