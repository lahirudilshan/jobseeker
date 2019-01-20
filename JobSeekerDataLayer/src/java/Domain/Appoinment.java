/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Shiyanrox
 */
@Entity
@Table(name = "appoinment")
@NamedQueries({
    @NamedQuery(name = "Appoinment.findAll", query = "SELECT a FROM Appoinment a")})
public class Appoinment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "appoinment_date")
    private String appoinmentDate;
    @Column(name = "from_date")
    private String fromDate;
    @Column(name = "to_time")
    private String toTime;
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User user;
    @JoinColumn(name = "consultant_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User user1;

    public Appoinment() {
    }

    public Appoinment(Integer id) {
        this.id = id;
    }

    public Appoinment(Integer id, String appoinmentDate) {
        this.id = id;
        this.appoinmentDate = appoinmentDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppoinmentDate() {
        return appoinmentDate;
    }

    public void setAppoinmentDate(String appoinmentDate) {
        this.appoinmentDate = appoinmentDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appoinment)) {
            return false;
        }
        Appoinment other = (Appoinment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.Appoinment[ id=" + id + " ]";
    }
    
}
