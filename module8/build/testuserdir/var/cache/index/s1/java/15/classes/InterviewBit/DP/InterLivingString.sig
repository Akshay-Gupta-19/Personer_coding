����   4 V
      java/lang/Object <init> ()V  aabcc 
 dbbca  
aadbbbaccc
      java/lang/String length ()I  [[[I
      java/util/Arrays fill ([II)V	       java/lang/System out Ljava/io/PrintStream;
  " # $ toCharArray ()[C
 & ' ( ) * !InterviewBit/DP/InterLivingString find ([C[C[CIII[[[I)I
 , - . / 0 java/io/PrintStream println (I)V
  2  3 ([CII)V
  5 6 7 equals (Ljava/lang/Object;)Z Code LineNumberTable LocalVariableTable this #LInterviewBit/DP/InterLivingString; main ([Ljava/lang/String;)V j I i args [Ljava/lang/String; A Ljava/lang/String; B C dp StackMapTable C MethodParameters a [C b c ai bi ci ans 
SourceFile InterLivingString.java ! &           8   /     *� �    9        :        ; <   	 = >  8  $     mL	MN+� `,� `-� `� :6�� )62�� 22� ������ղ +� !,� !-� !� %� +�    9   .         	  !  ,  :  F  L  R  l  :   H  /  ? @  $ . A @    m B C    j D E   g F E  	 d G E  ! L H   I   # � $  J      � 
� �  K    B    ) *  8  �     �,�� *�� +�� � �*�� -� Y++�d� 1� Y,,�d� 1� 4� � �+�� +� Y**�d� 1� Y,,�d� 1� 4� � �622.� 22.�*4,4� *+,``� %6+4,4� *+,``� %`6� ��    9   & 	       J ! y " | # � $ � % � & � ' :   R    � L M     � N M    � O M    � P @    � Q @    � R @    � H   | ` S @  I    @ -@ ,@ �   K    L   N   O   P   Q   R   H    T    U