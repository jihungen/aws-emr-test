package com.test

import org.apache.spark.sql.SparkSession

object SimpleSparkApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.config("hive.metastore.client.factory.class", "com.amazonaws.glue.catalog.metastore.AWSGlueDataCatalogHiveClientFactory").enableHiveSupport.getOrCreate
    spark.sql("show databases").show
  }
}
