����   4 c
      java/lang/Object <init> ()V  java/util/PriorityQueue   
   compare ()Ljava/util/Comparator;
     (Ljava/util/Comparator;)V
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
     add (Ljava/lang/Object;)Z
     poll ()Ljava/lang/Object;
     ! intValue ()I	 # $ % & ' java/lang/System out Ljava/io/PrintStream;
 ) * + , - java/io/PrintStream println (I)V / -InterviewBit/HeapsAndMaps/magicainAndChoclate Code LineNumberTable LocalVariableTable this /LInterviewBit/HeapsAndMaps/magicainAndChoclate; main ([Ljava/lang/String;)V i I ct args [Ljava/lang/String; A B [I pq Ljava/util/PriorityQueue; ans LocalVariableTypeTable .Ljava/util/PriorityQueue<Ljava/lang/Integer;>; StackMapTable ; > MethodParameters lambda$main$0 )(Ljava/lang/Integer;Ljava/lang/Integer;)I a Ljava/lang/Integer; b 
SourceFile magicainAndChoclate.java BootstrapMethods Q
 R S T U V "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; X '(Ljava/lang/Object;Ljava/lang/Object;)I Z
 . [ H I I InnerClasses _ %java/lang/invoke/MethodHandles$Lookup a java/lang/invoke/MethodHandles Lookup ! .           0   /     *� �    1        2        3 4   	 5 6  0  M     r<�
YOYOM� Y� 	  � N6,�� -,.� � W����66� (-� � � 6`6-l� � W���ز "� (�    1   :           &  2  8  ;  D  P  W  c  i  q  2   R    7 8  P  9 8  > + 7 8    r : ;    p < 8   c = >   V ? @  ; 7 A 8  B      V ? C  D    �   E F   � � � * G    :  
 H I  0   >     
+� *� d�    1        2       
 J K     
 L K   M    N O     P  W Y \ ]   
  ^ ` b 