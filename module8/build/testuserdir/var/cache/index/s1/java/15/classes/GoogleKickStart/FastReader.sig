����   4 b
      java/lang/Object <init> ()V  java/io/BufferedReader 
 java/io/InputStreamReader	      java/lang/System in Ljava/io/InputStream;
 	    (Ljava/io/InputStream;)V
     (Ljava/io/Reader;)V	      GoogleKickStart/FastReader br Ljava/io/BufferedReader;	      st Ljava/util/StringTokenizer;
 " # $ % & java/util/StringTokenizer hasMoreElements ()Z
  ( ) * readLine ()Ljava/lang/String;
 " ,  - (Ljava/lang/String;)V / java/io/IOException
 . 1 2  printStackTrace
 " 4 5 * 	nextToken
  7 8 * next
 : ; < = > java/lang/Integer parseInt (Ljava/lang/String;)I
 @ A B C D java/lang/Long 	parseLong (Ljava/lang/String;)J
 F G H I J java/lang/Double parseDouble (Ljava/lang/String;)D L   Code LineNumberTable LocalVariableTable this LGoogleKickStart/FastReader; e Ljava/io/IOException; StackMapTable nextInt ()I nextLong ()J 
nextDouble ()D nextLine str Ljava/lang/String; _ java/lang/String 
SourceFile template.java                          M   L     *� *� Y� 	Y� � � � �    N            O        P Q     8 *  M   �     6*� � *� � !�  *� "Y*� � '� +� ���L+� 0���*� � 3�   # & .  N         " # ' & $ ' & + ' . ) O     '  R S    6 P Q   T   	  T .   U V  M   2     *� 6� 9�    N       . O        P Q     W X  M   2     *� 6� ?�    N       3 O        P Q     Y Z  M   2     *� 6� E�    N       8 O        P Q     [ *  M   �     KL*� � 'L� M,� 0+�     .  N       =  @  E  B  D  F O        R S     P Q     \ ]  T    �    ^  .  `    a