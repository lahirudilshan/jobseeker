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
@Table(name = "country")
@NamedQueries({
    @NamedQuery(name = "Country.findAll", query = "SELECT c FROM Country c")})
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "country_name")
    private String countryName;
    @JoinTable(name = "user_country", joinColumns = {
        @JoinColumn(name = "country_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "user_id", referencedColumnName = "user_id")})
    @ManyToMany
    private List<User> userList;

    public Country() {
    }

    public Country(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
        if (!(object instanceof Country)) {
            return false;
        }
        Country other = (Country) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.Country[ id=" + id + " ]";
    }

    public void addCountry(Country country) {
        try {
            SQLExecutor exec = new SQLExecutor();
            String query = "insert into country (country_name) values ('" + country.countryName + "')";
            exec.excuteNonReturnQry(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCountry(Country country) {
        try {
            SQLExecutor exec = new SQLExecutor();
            String query = "update country set country_name='" + country.countryName + "' where id = '" + country.id + "'";
            exec.excuteNonReturnQry(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCountry(Country country) {
        try {
            SQLExecutor exec = new SQLExecutor();
            String query = "delete from country where id ='" + country.id + "'";
            exec.excuteNonReturnQry(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Country> allCountries() {
        try {
            ArrayList<Country> countryList = new ArrayList<Country>();
            SQLExecutor exec = new SQLExecutor();
            String query = "select * from country";
            ResultSet rs = exec.excuteReturnQry(query);
            while (rs.next()) {
                Country cont = new Country();
                cont.setId(rs.getInt("Id"));
                cont.setCountryName(rs.getString("country_name"));

                countryList.add(cont);
            }

            return countryList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Country> searchCountries(String text) {
        try {
            ArrayList<Country> countryList = new ArrayList<Country>();
            SQLExecutor exec = new SQLExecutor();
            String query = "select * from country where country_name like '%" + text + "%' ";
            ResultSet rs = exec.excuteReturnQry(query);
            while (rs.next()) {
                Country cont = new Country();
                cont.setId(rs.getInt("Id"));
                cont.setCountryName(rs.getString("country_name"));

                countryList.add(cont);
            }

            return countryList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Country countryByName(String name) {
        try {

            SQLExecutor exec = new SQLExecutor();
            String query = "select * from country where country_name = '" + name + "' ";
            ResultSet rs = exec.excuteReturnQry(query);
            Country country = new Country();
            while (rs.next()) {

                country.setId(rs.getInt("Id"));
                country.setCountryName(rs.getString("country_name"));

            }
            return country;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Country countryById(int id) {
        try {

            SQLExecutor exec = new SQLExecutor();
            String query = "select * from country where id = '" + id + "' ";
            ResultSet rs = exec.excuteReturnQry(query);
            Country country = new Country();
            while (rs.next()) {

                country.setId(rs.getInt("Id"));
                country.setCountryName(rs.getString("country_name"));

            }
            return country;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
