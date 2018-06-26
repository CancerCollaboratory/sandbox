/*
 * workflow_execution.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.wes.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.wes.model.Ga4ghWesState;
import javax.validation.constraints.*;

/**
 * Ga4ghWesWorkflowDesc
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-15T17:06:31.319-07:00")
public class Ga4ghWesWorkflowDesc   {
  @JsonProperty("workflow_id")
  private String workflowId = null;

  @JsonProperty("state")
  private Ga4ghWesState state = null;

  public Ga4ghWesWorkflowDesc workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * Get workflowId
   * @return workflowId
   **/
  @JsonProperty("workflow_id")
  @ApiModelProperty(value = "")
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  public Ga4ghWesWorkflowDesc state(Ga4ghWesState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @JsonProperty("state")
  @ApiModelProperty(value = "")
  public Ga4ghWesState getState() {
    return state;
  }

  public void setState(Ga4ghWesState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ga4ghWesWorkflowDesc ga4ghWesWorkflowDesc = (Ga4ghWesWorkflowDesc) o;
    return Objects.equals(this.workflowId, ga4ghWesWorkflowDesc.workflowId) &&
        Objects.equals(this.state, ga4ghWesWorkflowDesc.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesWorkflowDesc {\n");
    
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

