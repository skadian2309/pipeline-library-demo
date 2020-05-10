#!/usr/bin/env groovy

//def call(Map config=[:]) {
def call(body) {
   // echo  config.deploy
    body()
    pipeline {
    agent {
         label 'maven'
    }

}

}

