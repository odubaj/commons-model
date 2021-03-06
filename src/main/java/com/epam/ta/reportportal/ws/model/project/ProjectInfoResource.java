/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.project;

import com.epam.ta.reportportal.ws.model.ModelViews;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Project info resource representation for responses<br>
 * {@link com.epam.ta.reportportal.ws.model.ModelViews.DefaultView} used as
 * default fields output<br>
 * {@link com.epam.ta.reportportal.ws.model.ModelViews.FullProjectInfoView} used
 * as extended fields output<br>
 *
 * @author Dzmitry_Kavalets
 * @author Andrei_Ramanchuk
 */
public class ProjectInfoResource {

	@NotNull
	@JsonProperty(value = "id")
	private Long projectId;

	@NotBlank
	@JsonProperty(value = "projectName")
	private String projectName;

	@NotNull
	@JsonProperty(value = "usersQuantity")
	private Integer usersQuantity;

	@NotNull
	@JsonProperty(value = "launchesQuantity")
	private Integer launchesQuantity;

	@JsonProperty(value = "launchesPerUser")
	@JsonView(ModelViews.FullProjectInfoView.class)
	private List<LaunchesPerUser> launchesPerUser;

	@JsonProperty(value = "uniqueTickets")
	@JsonView(ModelViews.FullProjectInfoView.class)
	private Integer uniqueTickets;

	@JsonProperty(value = "launchesPerWeek")
	@JsonView(ModelViews.FullProjectInfoView.class)
	private String launchesPerWeek;

	@NotNull
	@JsonProperty(value = "lastRun")
	private Date lastRun;

	@NotNull
	@JsonProperty(value = "creationDate")
	private Date creationDate;

	@JsonProperty(value = "entryType")
	private String entryType;

	@JsonProperty(value = "organization")
	private String organization;

	public ProjectInfoResource() {
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getUsersQuantity() {
		return usersQuantity;
	}

	public void setUsersQuantity(Integer usersQuantity) {
		this.usersQuantity = usersQuantity;
	}

	public Integer getLaunchesQuantity() {
		return launchesQuantity;
	}

	public void setLaunchesQuantity(Integer launchesQuantity) {
		this.launchesQuantity = launchesQuantity;
	}

	public void setLaunchesPerUser(List<LaunchesPerUser> value) {
		this.launchesPerUser = value;
	}

	public List<LaunchesPerUser> getLaunchesPerUser() {
		return launchesPerUser;
	}

	public void setUniqueTickets(Integer value) {
		this.uniqueTickets = value;
	}

	public Integer getUniqueTickets() {
		return uniqueTickets;
	}

	public void setLaunchesPerWeek(String value) {
		this.launchesPerWeek = value;
	}

	public String getLaunchesPerWeek() {
		return launchesPerWeek;
	}

	public Date getLastRun() {
		return lastRun;
	}

	public void setLastRun(Date lastRun) {
		this.lastRun = lastRun;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getEntryType() {
		return entryType;
	}

	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
}
