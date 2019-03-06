/*
 * Genome Nexus API
 * Genome Nexus Variant Annotation API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PfamDomainRange
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-06T12:23:53.961-05:00")
public class PfamDomainRange {
  @SerializedName("pfamDomainId")
  private String pfamDomainId = null;

  @SerializedName("pfamDomainStart")
  private Integer pfamDomainStart = null;

  @SerializedName("pfamDomainEnd")
  private Integer pfamDomainEnd = null;

  public PfamDomainRange pfamDomainId(String pfamDomainId) {
    this.pfamDomainId = pfamDomainId;
    return this;
  }

   /**
   * Pfam domain id
   * @return pfamDomainId
  **/
  @ApiModelProperty(required = true, value = "Pfam domain id")
  public String getPfamDomainId() {
    return pfamDomainId;
  }

  public void setPfamDomainId(String pfamDomainId) {
    this.pfamDomainId = pfamDomainId;
  }

  public PfamDomainRange pfamDomainStart(Integer pfamDomainStart) {
    this.pfamDomainStart = pfamDomainStart;
    return this;
  }

   /**
   * Pfam domain start amino acid
   * @return pfamDomainStart
  **/
  @ApiModelProperty(required = true, value = "Pfam domain start amino acid")
  public Integer getPfamDomainStart() {
    return pfamDomainStart;
  }

  public void setPfamDomainStart(Integer pfamDomainStart) {
    this.pfamDomainStart = pfamDomainStart;
  }

  public PfamDomainRange pfamDomainEnd(Integer pfamDomainEnd) {
    this.pfamDomainEnd = pfamDomainEnd;
    return this;
  }

   /**
   * Pfam domain end amino acid
   * @return pfamDomainEnd
  **/
  @ApiModelProperty(required = true, value = "Pfam domain end amino acid")
  public Integer getPfamDomainEnd() {
    return pfamDomainEnd;
  }

  public void setPfamDomainEnd(Integer pfamDomainEnd) {
    this.pfamDomainEnd = pfamDomainEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PfamDomainRange pfamDomainRange = (PfamDomainRange) o;
    return Objects.equals(this.pfamDomainId, pfamDomainRange.pfamDomainId) &&
        Objects.equals(this.pfamDomainStart, pfamDomainRange.pfamDomainStart) &&
        Objects.equals(this.pfamDomainEnd, pfamDomainRange.pfamDomainEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pfamDomainId, pfamDomainStart, pfamDomainEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PfamDomainRange {\n");
    
    sb.append("    pfamDomainId: ").append(toIndentedString(pfamDomainId)).append("\n");
    sb.append("    pfamDomainStart: ").append(toIndentedString(pfamDomainStart)).append("\n");
    sb.append("    pfamDomainEnd: ").append(toIndentedString(pfamDomainEnd)).append("\n");
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

