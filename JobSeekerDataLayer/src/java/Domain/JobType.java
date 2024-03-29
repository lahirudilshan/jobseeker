/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import DBConnection.SQLExecutor;
import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Shiyanrox
 */
@Entity
@Table(name = "job_type")
@NamedQueries({
    @NamedQuery(name = "JobType.findAll", query = "SELECT j FROM JobType j")})
public class JobType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "job_type_name")
    private String jobTypeName;
    @JoinTable(name = "user_job_type", joinColumns = {
        @JoinColumn(name = "job_type_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "user_id", referencedColumnName = "user_id")})
    @ManyToMany
    private List<User> userList;

    public JobType() {
    }

    public JobType(Integer id) {
        this.id = id;
    }

    public JobType(Integer id, String jobTypeName) {
        this.id = id;
        this.jobTypeName = jobTypeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobTypeName() {
        return jobTypeName;
    }

    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
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
        if (!(object instanceof JobType)) {
            return false;
        }
        JobType other = (JobType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.JobType[ id=" + id + " ]";
    }
    
    public void addJobType(JobType jobType) {
        try {
            SQLExecutor exec = new SQLExecutor();
            String query = "insert into job_type (jobType_name) values ('" + jobType.jobTypeName + "')";
            exec.excuteNonReturnQry(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateJobType(JobType jobType) {
        try {
            SQLExecutor exec = new SQLExecutor();
            String query = "update job_type set job_type_name='" + jobType.jobTypeName + "' where id = '" + jobType.id + "'";
            exec.excuteNonReturnQry(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteJobType(JobType jobType) {
        try {
            SQLExecutor exec = new SQLExecutor();
            String query = "delete from job_type where id ='" + jobType.id + "'";
            exec.excuteNonReturnQry(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<JobType> allCountries() {
        try {
            ArrayList<JobType> jobTypeList = new ArrayList<JobType>();
            SQLExecutor exec = new SQLExecutor();
            String query = "select * from job_type";
            ResultSet rs = exec.excuteReturnQry(query);
            while (rs.next()) {
                JobType cont = new JobType();
                cont.setId(rs.getInt("Id"));
                cont.setJobTypeName(rs.getString("job_type_name"));

                jobTypeList.add(cont);
            }

            return jobTypeList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<JobType> searchCountries(String text) {
        try {
            ArrayList<JobType> jobTypeList = new ArrayList<JobType>();
            SQLExecutor exec = new SQLExecutor();
            String query = "select * from job_type where job_type_name like '%" + text + "%' ";
            ResultSet rs = exec.excuteReturnQry(query);
            while (rs.next()) {
                JobType cont = new JobType();
                cont.setId(rs.getInt("Id"));
                cont.setJobTypeName(rs.getString("job_type_name"));

                jobTypeList.add(cont);
            }

            return jobTypeList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public JobType jobTypeByName(String name) {
        try {

            SQLExecutor exec = new SQLExecutor();
            String query = "select * from jobType where job_type_name = '" + name + "' ";
            ResultSet rs = exec.excuteReturnQry(query);
            JobType jobType = new JobType();
            while (rs.next()) {

                jobType.setId(rs.getInt("Id"));
                jobType.setJobTypeName(rs.getString("job_type_name"));

            }
            return jobType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public JobType jobTypeById(int id) {
        try {

            SQLExecutor exec = new SQLExecutor();
            String query = "select * from jobType where id = '" + id + "' ";
            ResultSet rs = exec.excuteReturnQry(query);
            JobType jobType = new JobType();
            while (rs.next()) {

                jobType.setId(rs.getInt("Id"));
                jobType.setJobTypeName(rs.getString("job_type_name"));

            }
            return jobType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
