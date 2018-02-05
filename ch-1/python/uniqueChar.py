"""
 have a character set and set them all to false
 this is better because we can avoid storing a boolean
 for each character in our string and just store one
 for each character in our set

def uniqueChar( s ):
  dict = []
  char_set = {'a':False, 'b':False, 'c':False} #etc
  for char in s:
    if char_set[char] == False:
      char_set[char] = True
    else:
      return False
    return True

This would be a fast solution. But if the character set
is too large, we have to settle for the answer below

"""

def uniqueChar( s ):
  dict = []
  for index, c in enumerate(s):
    if c in dict:
      return False
    dict.append(c)
  return True


print(uniqueChar("kody"))
