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
 * Gene
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-06T12:23:57.095-05:00")
public class Gene {
  @SerializedName("geneId")
  private String geneId = null;

  @SerializedName("symbol")
  private String symbol = null;

  public Gene geneId(String geneId) {
    this.geneId = geneId;
    return this;
  }

   /**
   * geneid
   * @return geneId
  **/
  @ApiModelProperty(value = "geneid")
  public String getGeneId() {
    return geneId;
  }

  public void setGeneId(String geneId) {
    this.geneId = geneId;
  }

  public Gene symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gene gene = (Gene) o;
    return Objects.equals(this.geneId, gene.geneId) &&
        Objects.equals(this.symbol, gene.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geneId, symbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gene {\n");
    
    sb.append("    geneId: ").append(toIndentedString(geneId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

