# red-brick-bouncers
This is the code for a game with the placeholder name of Red Brick Bouncers.

Red Brick Bouncers (RBB, for short) is a 2D side-scrolling fighting game on a closed stage.
The core mechanic of the game is cartoon bouncing between obstacles, stage walls, and other similar objects.

To do the bouncing, players have 2 attribute: place_holder_name_Damage and place_holder_name_Power.
Power is defined as the "umph" to a player's actions. This matters in 3 interactions: first, when hitting another player, the more power, the harder the hit.
Second, when attempting to slow down bouncing (which will be explained later), the player is slowed down more. Third, when blocking, the high the power level, the more damage negation is done.
Damage is defined as the elasticity of the player: ie, how much of their momentum is conversed upon a bounce.

Timing also plays a major role in this game, also in 3 ways. First, the player whom is bouncing can time their jump to coincide with hitting a wall. In doing so,
the player will slow themselves down by a ratio based on their power level. Second, the player whom is not bouncing can hit the bouncing player in the air to increase their speed.
Third, the blocking player can block at the last possible moment to have the most effective block. (Both blocking and attacking have cooldowns to prevent spamming the buttons to hit the timing properly).

The overall idea of the match is that at first, when power levels and damage levels are low, the players are easily able to stop their bounces. As time goes on, however, the players become more powerful and elastic
and will thus bounce at unbelievably fast speeds. With this, there are 2 current game modes: 1, hitting as many bounce combos with the other player as possible in a given amount of time, or 2, be the first to hit a certain combo.

To be added: power-ups, new characters with special abilities, AI, and new levels!
