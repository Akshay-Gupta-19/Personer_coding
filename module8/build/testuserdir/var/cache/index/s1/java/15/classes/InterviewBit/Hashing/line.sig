����   4 7
      java/lang/Object <init> ()V	  	 
   InterviewBit/Hashing/line sloap D	     inter
      java/lang/Double valueOf (D)Ljava/lang/Double;
      java/util/Objects hash ([Ljava/lang/Object;)I
     getClass ()Ljava/lang/Class;�      
  # $ % doubleToLongBits (D)J Code LineNumberTable LocalVariableTable this LInterviewBit/Hashing/line; (DD)V MethodParameters hashCode ()I equals (Ljava/lang/Object;)Z obj Ljava/lang/Object; other StackMapTable 
SourceFile Fraction.java                         &   3     *� �    '   
       (        ) *     +  &   Y     *� *'� *)� �    '          	    (         ) *               ,   	        - .  &   F     � Y*� � SY*� � S� �    '        (        ) *    / 0  &   �     Y*+� �+� �*� +� � �+� M*�   �� ,�   �� *� � ",� � "�� �*� ,� �� ��    '   6    !  "  $  %  '  (  *  + 5 . G / I 1 U 2 W 4 (        Y ) *     Y 1 2   : 3 *  4    �   ,    1    5    6