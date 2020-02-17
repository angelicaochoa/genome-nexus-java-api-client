/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
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
import java.util.ArrayList;
import java.util.List;

/**
 * IntergenicConsequences
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T14:43:12.113-05:00")
public class IntergenicConsequences {
  @SerializedName("impact")
  private String impact = null;

  @SerializedName("variantAllele")
  private String variantAllele = null;

  @SerializedName("consequenceTerms")
  private List<String> consequenceTerms = new ArrayList<String>();

  public IntergenicConsequences impact(String impact) {
    this.impact = impact;
    return this;
  }

   /**
   * impact
   * @return impact
  **/
  @ApiModelProperty(required = true, value = "impact")
  public String getImpact() {
    return impact;
  }

  public void setImpact(String impact) {
    this.impact = impact;
  }

  public IntergenicConsequences variantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
    return this;
  }

   /**
   * variant_allele
   * @return variantAllele
  **/
  @ApiModelProperty(required = true, value = "variant_allele")
  public String getVariantAllele() {
    return variantAllele;
  }

  public void setVariantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
  }

  public IntergenicConsequences consequenceTerms(List<String> consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
    return this;
  }

  public IntergenicConsequences addConsequenceTermsItem(String consequenceTermsItem) {
    this.consequenceTerms.add(consequenceTermsItem);
    return this;
  }

   /**
   * consequence_terms
   * @return consequenceTerms
  **/
  @ApiModelProperty(required = true, value = "consequence_terms")
  public List<String> getConsequenceTerms() {
    return consequenceTerms;
  }

  public void setConsequenceTerms(List<String> consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntergenicConsequences intergenicConsequences = (IntergenicConsequences) o;
    return Objects.equals(this.impact, intergenicConsequences.impact) &&
        Objects.equals(this.variantAllele, intergenicConsequences.variantAllele) &&
        Objects.equals(this.consequenceTerms, intergenicConsequences.consequenceTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impact, variantAllele, consequenceTerms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntergenicConsequences {\n");
    
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    variantAllele: ").append(toIndentedString(variantAllele)).append("\n");
    sb.append("    consequenceTerms: ").append(toIndentedString(consequenceTerms)).append("\n");
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
