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
import org.genome_nexus.client.Gene;
import org.genome_nexus.client.Hg19;
import org.genome_nexus.client.Hg38;
import org.genome_nexus.client.Hgvs;

/**
 * ClinVar
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-06T12:23:53.961-05:00")
public class ClinVar {
  @SerializedName("_license")
  private String license = null;

  @SerializedName("alleleId")
  private Integer alleleId = null;

  @SerializedName("alt")
  private String alt = null;

  @SerializedName("chrom")
  private String chrom = null;

  @SerializedName("cytogenic")
  private String cytogenic = null;

  @SerializedName("gene")
  private Gene gene = null;

  @SerializedName("hg19")
  private Hg19 hg19 = null;

  @SerializedName("hg38")
  private Hg38 hg38 = null;

  @SerializedName("hgvs")
  private Hgvs hgvs = null;

  public ClinVar license(String license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(value = "")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public ClinVar alleleId(Integer alleleId) {
    this.alleleId = alleleId;
    return this;
  }

   /**
   * allele_id
   * @return alleleId
  **/
  @ApiModelProperty(value = "allele_id")
  public Integer getAlleleId() {
    return alleleId;
  }

  public void setAlleleId(Integer alleleId) {
    this.alleleId = alleleId;
  }

  public ClinVar alt(String alt) {
    this.alt = alt;
    return this;
  }

   /**
   * alt
   * @return alt
  **/
  @ApiModelProperty(value = "alt")
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  public ClinVar chrom(String chrom) {
    this.chrom = chrom;
    return this;
  }

   /**
   * chrom
   * @return chrom
  **/
  @ApiModelProperty(value = "chrom")
  public String getChrom() {
    return chrom;
  }

  public void setChrom(String chrom) {
    this.chrom = chrom;
  }

  public ClinVar cytogenic(String cytogenic) {
    this.cytogenic = cytogenic;
    return this;
  }

   /**
   * cytogenic
   * @return cytogenic
  **/
  @ApiModelProperty(value = "cytogenic")
  public String getCytogenic() {
    return cytogenic;
  }

  public void setCytogenic(String cytogenic) {
    this.cytogenic = cytogenic;
  }

  public ClinVar gene(Gene gene) {
    this.gene = gene;
    return this;
  }

   /**
   * gene
   * @return gene
  **/
  @ApiModelProperty(value = "gene")
  public Gene getGene() {
    return gene;
  }

  public void setGene(Gene gene) {
    this.gene = gene;
  }

  public ClinVar hg19(Hg19 hg19) {
    this.hg19 = hg19;
    return this;
  }

   /**
   * hg19
   * @return hg19
  **/
  @ApiModelProperty(value = "hg19")
  public Hg19 getHg19() {
    return hg19;
  }

  public void setHg19(Hg19 hg19) {
    this.hg19 = hg19;
  }

  public ClinVar hg38(Hg38 hg38) {
    this.hg38 = hg38;
    return this;
  }

   /**
   * hg38
   * @return hg38
  **/
  @ApiModelProperty(value = "hg38")
  public Hg38 getHg38() {
    return hg38;
  }

  public void setHg38(Hg38 hg38) {
    this.hg38 = hg38;
  }

  public ClinVar hgvs(Hgvs hgvs) {
    this.hgvs = hgvs;
    return this;
  }

   /**
   * hgvs
   * @return hgvs
  **/
  @ApiModelProperty(value = "hgvs")
  public Hgvs getHgvs() {
    return hgvs;
  }

  public void setHgvs(Hgvs hgvs) {
    this.hgvs = hgvs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClinVar clinVar = (ClinVar) o;
    return Objects.equals(this.license, clinVar.license) &&
        Objects.equals(this.alleleId, clinVar.alleleId) &&
        Objects.equals(this.alt, clinVar.alt) &&
        Objects.equals(this.chrom, clinVar.chrom) &&
        Objects.equals(this.cytogenic, clinVar.cytogenic) &&
        Objects.equals(this.gene, clinVar.gene) &&
        Objects.equals(this.hg19, clinVar.hg19) &&
        Objects.equals(this.hg38, clinVar.hg38) &&
        Objects.equals(this.hgvs, clinVar.hgvs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(license, alleleId, alt, chrom, cytogenic, gene, hg19, hg38, hgvs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClinVar {\n");
    
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    alleleId: ").append(toIndentedString(alleleId)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    chrom: ").append(toIndentedString(chrom)).append("\n");
    sb.append("    cytogenic: ").append(toIndentedString(cytogenic)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    hg19: ").append(toIndentedString(hg19)).append("\n");
    sb.append("    hg38: ").append(toIndentedString(hg38)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
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

