package jpa.tuto;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
@Table(name="USER")
public class User implements java.io.Serializable {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="LAST_NAME")
	private String name;
	@Column(name="FIRST_NAME")
	private String forename;
	@Temporal(TemporalType.DATE)
	private Date added;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public Date getAdded() {
		return added;
	}
	public void setAdded(Date added) {
		this.added = added;
	}

	
	
}
