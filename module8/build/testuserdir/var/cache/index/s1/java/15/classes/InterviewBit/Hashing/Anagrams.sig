����   4 �
      java/lang/Object <init> ()V  java/lang/String 
 java/util/HashMap
 	 
     toCharArray ()[C
      java/util/Arrays sort ([C)V
    
 	    containsKey (Ljava/lang/Object;)Z  java/util/ArrayList
  
 	   ! " put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
 	 $ % & get &(Ljava/lang/Object;)Ljava/lang/Object;
 ( ) * + , java/lang/Integer valueOf (I)Ljava/lang/Integer;
  . /  add
 	 1 2 3 keySet ()Ljava/util/Set; 5 6 7 8 9 java/util/Set iterator ()Ljava/util/Iterator;
 	 ; < = size ()I ? [I A B C D E java/util/Iterator hasNext ()Z A G H I next ()Ljava/lang/Object;
  ;
  L % M (I)Ljava/lang/Object;
 ( O P = intValue	 R S T U V java/lang/System out Ljava/io/PrintStream;
 X Y Z [ \ java/io/PrintStream println (Ljava/lang/Object;)V ^ InterviewBit/Hashing/Anagrams Code LineNumberTable LocalVariableTable this LInterviewBit/Hashing/Anagrams; main ([Ljava/lang/String;)V 
sortedChar [C cs Ljava/lang/String; i I al2 Ljava/util/ArrayList; j args [Ljava/lang/String; A al Ljava/util/HashMap; it Ljava/util/Iterator; ans [[I LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; QLjava/util/HashMap<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>; (Ljava/util/Iterator<Ljava/lang/String;>; StackMapTable p g w MethodParameters 
SourceFile Anagrams.java ! ]           _   /     *� �    `        a        b c   	 d e  _       �� L� 	Y� M>+�� I+2� :� � Y� :,� � ,� Y� � W,� #� � '� -W����,� 0� 4 N,� :� >:6-� @ � L,-� F � #� :� J�
S6� J� 2� K� (� NO���ބ���� Q� W�    `   R             "  -  D  U  [  e  n  z  �  �  �  �  �  � ! � # a   p   8 f g  - ( h i   L j k  � % j k  � 4 l m  q R n k    � o p    � q p   � r s  e g t u  n ^ v w  x      � 4 l y   � r z  e g t {  |   / �  } 	� 4 ~ � �  A � & � $�  �    o    �    �