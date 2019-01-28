/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Shiyanrox
 */
@Entity
@Table(name = "user")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "contact_no")
    private String contactNo;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @ManyToMany(mappedBy = "userList")
    private List<Country> countryList;
    @ManyToMany(mappedBy = "userList")
    private List<JobType> jobTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Appoinment> appoinmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user1")
    private List<Appoinment> appoinmentList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Shedule> sheduleList;
    @JoinColumn(name = "user_roles_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private UserRoles userRoles;

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String firstName, String lastName, String password, String emailAddress, int status) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    public List<JobType> getJobTypeList() {
        return jobTypeList;
    }

    public void setJobTypeList(List<JobType> jobTypeList) {
        this.jobTypeList = jobTypeList;
    }

    public List<Appoinment> getAppoinmentList() {
        return appoinmentList;
    }

    public void setAppoinmentList(List<Appoinment> appoinmentList) {
        this.appoinmentList = appoinmentList;
    }

    public List<Appoinment> getAppoinmentList1() {
        return appoinmentList1;
    }

    public void setAppoinmentList1(List<Appoinment> appoinmentList1) {
        this.appoinmentList1 = appoinmentList1;
    }

    public List<Shedule> getSheduleList() {
        return sheduleList;
    }

    public void setSheduleList(List<Shedule> sheduleList) {
        this.sheduleList = sheduleList;
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.User[ userId=" + userId + " ]";
    }
    
}
