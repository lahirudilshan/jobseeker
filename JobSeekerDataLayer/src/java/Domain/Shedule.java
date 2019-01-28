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
@Table(name = "shedule")
@NamedQueries({
    @NamedQuery(name = "Shedule.findAll", query = "SELECT s FROM Shedule s")})
public class Shedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @Column(name = "from_time")
    private String fromTime;
    @Basic(optional = false)
    @Column(name = "to_time")
    private String toTime;
    @Column(name = "per_person_time")
    private String perPersonTime;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User user;

    public Shedule() {
    }

    public Shedule(Integer id) {
        this.id = id;
    }

    public Shedule(Integer id, String date, String fromTime, String toTime, int status) {
        this.id = id;
        this.date = date;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getPerPersonTime() {
        return perPersonTime;
    }

    public void setPerPersonTime(String perPersonTime) {
        this.perPersonTime = perPersonTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        if (!(object instanceof Shedule)) {
            return false;
        }
        Shedule other = (Shedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.Shedule[ id=" + id + " ]";
    }
    
}
