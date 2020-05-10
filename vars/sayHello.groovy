#!/usr/bin/env groovy

def call(Map config=[:]) {
   // echo  config.deploy
    
    pipeline {
    agent {
         label 'maven'
    }

}

}

