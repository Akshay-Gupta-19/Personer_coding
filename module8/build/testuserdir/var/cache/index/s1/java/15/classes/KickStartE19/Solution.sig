����   4 F
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I	 
    out Ljava/io/PrintStream;  java/lang/StringBuilder
    Case #
    ! " append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  $ ! % (I)Ljava/lang/StringBuilder; ' : 
  ) * + toString ()Ljava/lang/String;
 - . / 0 1 java/io/PrintStream println (Ljava/lang/String;)V 3 KickStartE19/Solution Code LineNumberTable LocalVariableTable this LKickStartE19/Solution; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; sc Ljava/util/Scanner; t StackMapTable MethodParameters 
SourceFile Q3.java   2            4   /     *� �    5        6        7 8   	 9 :  4   �     <� Y� 	� L+� =>� '� � Y� � � #&� � (� ,���ڱ    5       
       5  ;  6   *   ) ; <    < = >    1 ? @   , A <  B    �  � ( C    =    D    E