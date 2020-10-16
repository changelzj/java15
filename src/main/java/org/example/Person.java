package org.example;

public sealed class Person permits Student, Teacher, Worker {

}


final class Teacher extends Person { }

sealed class Student extends Person permits MiddleStudent { }

non-sealed class Worker extends Person {}

final class MiddleStudent extends Student { }

class RailwayWorker extends Worker { }

