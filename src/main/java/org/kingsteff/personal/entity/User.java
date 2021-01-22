package org.kingsteff.personal.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @UniqueConstraint("login_unique")
    private String login;
    private String description;
    private String password;
    private Integer loginFailedCount;
    @OneToMany
    @JoinColumn(name = "passwordList_id")
    private Set<PasswordInfos> passwordList;
    @UniqueConstraint("logintoken")
    private UUID currentLoginKey;

    public Set<PasswordInfos> getPasswordList() {
        return passwordList;
    }

    public void setPasswordList(Set<PasswordInfos> passwordList) {
        this.passwordList = passwordList;
    }

    public UUID getCurrentLoginKey() {
        return currentLoginKey;
    }

    public void setCurrentLoginKey(UUID currentLoginKey) {
        this.currentLoginKey = currentLoginKey;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLoginFailedCount() {
        return loginFailedCount;
    }

    public void setLoginFailedCount(Integer loginFailedCount) {
        this.loginFailedCount = loginFailedCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId().equals(user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
