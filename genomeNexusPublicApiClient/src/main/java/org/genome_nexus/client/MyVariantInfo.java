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
import org.genome_nexus.client.ClinVar;
import org.genome_nexus.client.Cosmic;
import org.genome_nexus.client.Dbsnp;
import org.genome_nexus.client.Mutdb;
import org.genome_nexus.client.Snpeff;
import org.genome_nexus.client.Vcf;

/**
 * MyVariantInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-06T12:23:53.961-05:00")
public class MyVariantInfo {
  @SerializedName("clinVar")
  private ClinVar clinVar = null;

  @SerializedName("cosmic")
  private Cosmic cosmic = null;

  @SerializedName("dbsnp")
  private Dbsnp dbsnp = null;

  @SerializedName("hgvs")
  private String hgvs = null;

  @SerializedName("mutdb")
  private Mutdb mutdb = null;

  @SerializedName("snpeff")
  private Snpeff snpeff = null;

  @SerializedName("vcf")
  private Vcf vcf = null;

  @SerializedName("version")
  private Integer version = null;

  public MyVariantInfo clinVar(ClinVar clinVar) {
    this.clinVar = clinVar;
    return this;
  }

   /**
   * Get clinVar
   * @return clinVar
  **/
  @ApiModelProperty(value = "")
  public ClinVar getClinVar() {
    return clinVar;
  }

  public void setClinVar(ClinVar clinVar) {
    this.clinVar = clinVar;
  }

  public MyVariantInfo cosmic(Cosmic cosmic) {
    this.cosmic = cosmic;
    return this;
  }

   /**
   * cosmic
   * @return cosmic
  **/
  @ApiModelProperty(value = "cosmic")
  public Cosmic getCosmic() {
    return cosmic;
  }

  public void setCosmic(Cosmic cosmic) {
    this.cosmic = cosmic;
  }

  public MyVariantInfo dbsnp(Dbsnp dbsnp) {
    this.dbsnp = dbsnp;
    return this;
  }

   /**
   * dbsnp
   * @return dbsnp
  **/
  @ApiModelProperty(value = "dbsnp")
  public Dbsnp getDbsnp() {
    return dbsnp;
  }

  public void setDbsnp(Dbsnp dbsnp) {
    this.dbsnp = dbsnp;
  }

  public MyVariantInfo hgvs(String hgvs) {
    this.hgvs = hgvs;
    return this;
  }

   /**
   * hgvs
   * @return hgvs
  **/
  @ApiModelProperty(value = "hgvs")
  public String getHgvs() {
    return hgvs;
  }

  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }

  public MyVariantInfo mutdb(Mutdb mutdb) {
    this.mutdb = mutdb;
    return this;
  }

   /**
   * Get mutdb
   * @return mutdb
  **/
  @ApiModelProperty(value = "")
  public Mutdb getMutdb() {
    return mutdb;
  }

  public void setMutdb(Mutdb mutdb) {
    this.mutdb = mutdb;
  }

  public MyVariantInfo snpeff(Snpeff snpeff) {
    this.snpeff = snpeff;
    return this;
  }

   /**
   * snpeff
   * @return snpeff
  **/
  @ApiModelProperty(value = "snpeff")
  public Snpeff getSnpeff() {
    return snpeff;
  }

  public void setSnpeff(Snpeff snpeff) {
    this.snpeff = snpeff;
  }

  public MyVariantInfo vcf(Vcf vcf) {
    this.vcf = vcf;
    return this;
  }

   /**
   * vcf
   * @return vcf
  **/
  @ApiModelProperty(value = "vcf")
  public Vcf getVcf() {
    return vcf;
  }

  public void setVcf(Vcf vcf) {
    this.vcf = vcf;
  }

  public MyVariantInfo version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * version
   * @return version
  **/
  @ApiModelProperty(value = "version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyVariantInfo myVariantInfo = (MyVariantInfo) o;
    return Objects.equals(this.clinVar, myVariantInfo.clinVar) &&
        Objects.equals(this.cosmic, myVariantInfo.cosmic) &&
        Objects.equals(this.dbsnp, myVariantInfo.dbsnp) &&
        Objects.equals(this.hgvs, myVariantInfo.hgvs) &&
        Objects.equals(this.mutdb, myVariantInfo.mutdb) &&
        Objects.equals(this.snpeff, myVariantInfo.snpeff) &&
        Objects.equals(this.vcf, myVariantInfo.vcf) &&
        Objects.equals(this.version, myVariantInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clinVar, cosmic, dbsnp, hgvs, mutdb, snpeff, vcf, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyVariantInfo {\n");
    
    sb.append("    clinVar: ").append(toIndentedString(clinVar)).append("\n");
    sb.append("    cosmic: ").append(toIndentedString(cosmic)).append("\n");
    sb.append("    dbsnp: ").append(toIndentedString(dbsnp)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    mutdb: ").append(toIndentedString(mutdb)).append("\n");
    sb.append("    snpeff: ").append(toIndentedString(snpeff)).append("\n");
    sb.append("    vcf: ").append(toIndentedString(vcf)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

