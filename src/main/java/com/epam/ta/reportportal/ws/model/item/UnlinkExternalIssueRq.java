/*
 * Copyright 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.epam.ta.reportportal.ws.model.item;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Pavel Bortnik
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnlinkExternalIssueRq {

	@NotNull
	@JsonProperty(value = "testItemIds")
	private List<Long> testItemIds;

	@NotNull
	@JsonProperty(value = "ticketIds")
	private List<String> ticketIds;

	public List<Long> getTestItemIds() {
		return testItemIds;
	}

	public void setTestItemIds(List<Long> testItemIds) {
		this.testItemIds = testItemIds;
	}

	public List<String> getTicketIds() {
		return ticketIds;
	}

	public void setTicketIds(List<String> ticketIds) {
		this.ticketIds = ticketIds;
	}
}
