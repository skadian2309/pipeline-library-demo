#!/usr/bin/env groovy

//def call(Map config=[:]) {
def call(Map pipelineParams) {
   // echo  config.deploy
    //body()
    pipeline {
    agent {
         label 'maven'
    }

}

}

