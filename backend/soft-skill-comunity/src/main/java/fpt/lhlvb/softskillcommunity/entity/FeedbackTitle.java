package fpt.lhlvb.softskillcommunity.entity;

import fpt.lhlvb.softskillcommunity.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "feedback_title", schema = "public", catalog = "softskill")
public class FeedbackTitle extends BaseEntity {
    @Basic
    @Column(name = "name")
    private String name;
}
