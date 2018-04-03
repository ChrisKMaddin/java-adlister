USE adlister_db;

INSERT  INTO users (username, email, password) VALUES
  ('wonka', 'wonka@email.com', '1234');

INSERT INTO ads (user_id, title, description) VALUES
  (1, 'Nintendo', 'Classic game console for the kids'),
  (1, 'Tennis ball', 'Play a bunch of tennis'),
  (1, 'Orange Cone', 'Stop traffic'),
  (1, 'Butterfly Net', 'Catch all them butterflies');
